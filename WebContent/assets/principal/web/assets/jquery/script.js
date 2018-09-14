$("#cnpj").mask("99.999.999/9999-99");  
$("#dataFundacao").mask("99/99/9999");     
$("#cepAssociacao").mask("99999-999");  
$("#periodoGestao").mask("99/99/9999");
$("#cpf").mask("999.999.999-99");
$("#dataNascimento").mask("99/99/9999");
$("#cepResponsavel").mask("99999-999");  
$('#telefone').focusout(function(){
    var phone, element;
    element = $(this);
    element.unmask();
    phone = element.val().replace(/\D/g, '');
    if(phone.length > 10) {
        element.mask("(99) 99999-999?9");
    } else {
        element.mask("(99) 9999-9999?9");
    }
}).trigger('focusout');
$("#orcamento").maskMoney({showSymbol: true, symbol:'R$ ', thousands:'.', decimal:',', affixesStay: false});
$("#cep").mask("99999-999");  
