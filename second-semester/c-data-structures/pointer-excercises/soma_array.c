#include <stdio.h>

int soma(int *num) {
  int soma = 0;
  while(*num != NULL){
    soma += *num++;
  }
  return soma;
}

void main() {
  int vetor[6] = {25, 25, 25, 25, 25, 25};
  int resultado = 0;
  resultado = soma(vetor);
  printf("resultado: %d\n", resultado);
  return;
}