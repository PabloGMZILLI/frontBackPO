function validateForm() {
	
	let form = document.querySelector("#register-form");

	if (isEmpty(form.username) || isEmpty(form.user_email) || isEmpty(form.phone.value) ||
			isEmpty(form.password.value) ){
		inputMessage("Todos os campos devem ser preenchidos!");
		return false;
	}
	if (form.username.value.length < 5) {
		inputMessage("Preencha campo NOME corretamente!");
		form.username.focus();
		return false;
	}
	
	if(form.email.value.indexOf('@') == -1
			|| form.email.value.indexOf('.') == -1) {
		inputMessage("Preencha campo E-MAIL corretamente!");
		form.email.focus();
		return false;
	}
	if (!/^\([1-9]{2}\) (?:[2-8]|9[1-9])[0-9]{3}\-[0-9]{4}$/.test(form.phone.value)) {
		form.phone.focus();
		inputMessage("Telefone inválido!");
		return false;
	}
}	
function isEmpty(field) {
	console.log('Valor =>', field.value);
	if (typeof field.value == "undefined") {
		console.log("ta undefined");
		return true;
	}

	if (field.value == "") {
		console.log("ta vazio");
		return true;
	}
	return false;
}
function inputMessage(text) {
	let message = document.querySelector('.message')
	message.innerHTML = text;
}
