# sistemaAutenticacaoPagamento
1 - Desafio:


Crie um pequeno sistema de autenticação e pagamento:

´abstract class Pagamento´

atributo valor

método ´abstrato processar()´

interface ´Autenticavel´

método ´boolean autenticar(String token)´

´class CartaoCredito e class Pix´

implementam os contratos e fazem validação segura.



2 - Extras de segurança:

Valide o valor > 0

Use tokens de autenticação de 6 dígitos

Lance exceções personalizadas ´(IllegalArgumentException)´