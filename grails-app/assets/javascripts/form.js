window.addEventListener('DOMContentLoaded', (event) => {
    const salary = document.querySelector('#salary');
    setTextValue('.salary-output', salary.value);
    salary.addEventListener('input', function () {
        setTextValue('.salary-output', salary.value)
    });
});

const setTextValue = (id, value) => {
    const element = document.querySelector(id);
    element.textContent = value;
}