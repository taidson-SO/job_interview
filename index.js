const btn_reverse = document.getElementById('btn-reverse');

btn_reverse.addEventListener('click', () => {


	let input_string = document.getElementById('input_string').value;
	let text = "";


	for(let i=0; i < input_string.length; i++){
		text += input_string[input_string.length-1-i];
	}

	let showInverse = document.createElement('div');
	let textInverse = document.createElement('h2');
	textInverse.innerText = text;

	showInverse.appendChild(textInverse);
	document.body.appendChild(showInverse);

})
