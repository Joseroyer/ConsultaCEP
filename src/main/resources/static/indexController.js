function mascara(m, t, e) {
    var cursor = t.selectionStart;
    var texto = t.value;
    texto = texto.replace(/\D/g, '');
    var l = texto.length;
    var lm = m.length;
    if (window.event) {
        id = e.keyCode;
    } else if (e.which) {
        id = e.which;
    }
    cursorfixo = false;
    if (cursor < l) cursorfixo = true;
    var livre = false;
    if (id == 16 || id == 19 || (id >= 33 && id <= 40)) livre = true;
    ii = 0;
    mm = 0;
    if (!livre) {
        if (id != 8) {
            t.value = "";
            j = 0;
            for (i = 0; i < lm; i++) {
                if (m.substr(i, 1) == "#") {
                    t.value += texto.substr(j, 1);
                    j++;
                } else if (m.substr(i, 1) != "#") {
                    t.value += m.substr(i, 1);
                }
                if (id != 8 && !cursorfixo) cursor++;
                if ((j) == l + 1) break;

            }
        }
    }
    if (cursorfixo && !livre) cursor--;
    t.setSelectionRange(cursor, cursor);
}

function appendTabela(data) {
    var table = "";
    if(!data.length)
            table += `<td colspan="5" style="color: red">O CEP NÃO ENCONTRADO!!</td>`
    else{
        for (let i = 0; i < data.length; i++) {
            table += `<tr>
            <td>${data[i].cep}</td>
            <td>${data[i].fk_cidade.nome}</td>
            <td>${data[i].fk_cidade.estado}</td>
            <td>${data[i].local}</td>
            <td>${data[i].fk_bairro.nome}</td>
            </tr>`;
        }
    }
    document.getElementById("result").innerHTML = table;
}
function pesquisar() {
    var filtro = document.getElementById("buscar").value;
    filtro = filtro.replace("-", "").replace(".", "");
    fetch("/ConsultarCEP?filtro=" + filtro)
        .then(function (response) {
            return response.json();
        })
        .then(function (data) {
            appendTabela(data);
        })
        .catch(function (err) {
            console.error(err);
        });
}