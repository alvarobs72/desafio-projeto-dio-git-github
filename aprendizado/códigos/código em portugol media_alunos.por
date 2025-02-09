programa {
funcao inicio() {
    real a, b, c, nota_a, nota_b, nota_c

    escreva("digite a 1ª nota do(a) aluno(a) Aluno_1: ")
    leia(a)

    escreva("digite a 2ª nota do(a) aluno(a) Aluno_1: ")
    leia(b)

    escreva("digite a 3ª nota do(a) aluno(a) Aluno_1: ")
    leia(c)

    escreva("digite a 1ª nota do(a) aluno(a) Aluno_2: ")
    leia(nota_a)

    escreva("digite a 2ª nota do(a) aluno(a) Aluno_2: ")
    leia(nota_b)

    escreva("digite a 3ª nota do(a) aluno(a) Aluno_2: ")
    leia(nota_c)

    escreva("\nMédia do(a) aluno(a) Aluno_1: ", media_aluno(a, b, c))
    escreva("\n\nMédia do(a) aluno(a) Aluno_2: ", media_aluno(nota_a, nota_b, nota_c))
}

funcao real media_aluno(real nota_1, real nota_2, real nota_3){
    retorne (nota_1 + nota_2 + nota_3)/3
}
}