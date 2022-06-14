function appendTabela(data) {
    var table = "";
    // document.querySelector("#tabela").classList.remove("d-none");
    table += `<tr><th>CEP</th><th>Local</th><th>Cidade</th><th>Bairro</th></tr>`
    for (let i = 0; i < data.length; i++)
        table += `<tr>
            <td>${data[i].cep}</td>
            <td>${data[i].local}</td>
            <td>${data[i].fk_cidade}</td>
            <td>${data[i].fk_bairro}</td>
            </tr>`;
    document.getElementById("result").innerHTML = table;

}

function pesquisar() {
    var filtro = document.getElementById("buscar").value;
    fetch("/apis/consultarCEP?filtro=" + filtro)
        .then(function (response) {
            return response.json();
        })
        .then(function (data) {
            appendTabela(data);
        })
        .catch(function (err) {
            console.log('Error' + err);
        });
}