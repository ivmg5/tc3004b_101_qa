function calculate(operator) {
    const num1 = Number(document.getElementById('num1').value);
    const num2 = Number(document.getElementById('num2').value);

    const params = new URLSearchParams();
    params.append("num1", num1);
    params.append("num2", num2);

    const endpoint = operator === '+' ? '/add' : '/sub';

    fetch(`http://localhost:8080${endpoint}?${params}`)
        .then(response => response.json())
        .then(data => {
            console.log("Response from backend:", data);
            document.getElementById('result').innerText = `Result: ${data.result !== undefined ? data.result : "Error"}`;
        })
        .catch(error => console.error("Fetch error:", error));
}

function resetFields() {
    document.getElementById('num1').value = "";
    document.getElementById('num2').value = "";
    document.getElementById('result').innerText = "Result: ";
}