const stripe = Stripe('pk_test_51Qm3MW4EiyRfw6pDiXQpKGXuY8IyQoQica1Civ5lvAJDSY1IiSrwAw6BVFf50kkMHTkjGBi9VUmX275tOmF2dtrM00vwZKFIfy');

const paymentButton = document.querySelector('#paymentButton');

paymentButton.addEventListener('click', () => {
	stripe.redirectToCheckout({
		sessionId: sessionId
	})
});
