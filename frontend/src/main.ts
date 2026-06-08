const backendHttpBase = 'http://localhost:8080';
const backendWsBase = 'ws://localhost:8080/ws/messages';

const restButton = document.querySelector<HTMLButtonElement>('#restButton');
const restResult = document.querySelector<HTMLParagraphElement>('#restResult');
const wsInput = document.querySelector<HTMLInputElement>('#wsInput');
const wsButton = document.querySelector<HTMLButtonElement>('#wsButton');
const wsStatus = document.querySelector<HTMLParagraphElement>('#wsStatus');
const wsResult = document.querySelector<HTMLParagraphElement>('#wsResult');

if (!restButton || !restResult || !wsInput || !wsButton || !wsStatus || !wsResult) {
  throw new Error('Required UI elements are missing.');
}

const socket = new WebSocket(backendWsBase);

socket.addEventListener('open', () => {
  wsStatus.textContent = 'WebSocket connected';
});

socket.addEventListener('message', (event) => {
  wsResult.textContent = `Received: ${event.data}`;
});

socket.addEventListener('close', () => {
  wsStatus.textContent = 'WebSocket disconnected';
});

socket.addEventListener('error', () => {
  wsStatus.textContent = 'WebSocket error';
});

restButton.addEventListener('click', async () => {
  try {
    const response = await fetch(`${backendHttpBase}/api/health`);
    const body = (await response.json()) as { message: string };
    restResult.textContent = body.message;
  } catch (error) {
    restResult.textContent = `REST error: ${String(error)}`;
  }
});

wsButton.addEventListener('click', () => {
  const message = wsInput.value;
  if (socket.readyState !== WebSocket.OPEN) {
    wsStatus.textContent = 'WebSocket is not connected';
    return;
  }

  socket.send(message);
});
