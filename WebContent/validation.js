function validateForm() {
	let form = document.querySelector("#register-form");
	if (isEmpty(form.user_name) || isEmpty(form.user_email)
			|| isEmpty(form.user_phone) || isEmpty(form.user_password)) {
		inputMessage("Todos os campos devem ser preenchidos!");
		return false;
	}
}

function isEmpty(field) {
	if (typeof field.value == "undefined") {
		return true;
	}

	if (field.value == "") {
		return true;
	}
	return false;
}
function inputMessage(text) {
	let message = document.querySelector('.message')
	message.innerHTML = text;
}
