function calculate(operator) {
    const num1 = Number(document.getElementById('num1').value);
    const num2 = Number(document.getElementById('num2').value);

    let result;

    if (operator === '+') {
        result = num1 + num2;
    } else if (operator === '-') {
        result = num1 - num2;
    }

    document.getElementById('result').innerText = "Result: " + result;
}

function resetFields() {
    document.getElementById('num1').value = "";
    document.getElementById('num2').value = "";
    document.getElementById('result').innerText = "Result: ";
}