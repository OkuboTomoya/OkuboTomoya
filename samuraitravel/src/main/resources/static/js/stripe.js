const stripe = Stripe('pk_test_51Pd54iRuVU0svFqSQgT6oSsQTuEd0TVRzomLgj0Ya21SX5ivfotAH66HhP5LfxljnxqoXTAhknDDs7AVLu63EwDX00f8gyhzOJ');
const paymentButton = document.querySelector('#paymentButton');

paymentButton.addEventListener('click', () => {
	stripe.redirectToCheckout({
		sessionId: sessionId
	})
});