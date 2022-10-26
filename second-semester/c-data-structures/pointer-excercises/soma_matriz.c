#include <stdio.h>

int soma(int *p) {
  int soma = 0;
  while(*p != NULL){
    soma += *p++;
  };
  return soma;
}

void main() {
  int matriz[3][3] = {  {2,4,8}, {1,5,6}, {3,1, 1} };
  int resultado = 0;
  resultado = soma(matriz);
  printf("%d\n", resultado);
  return; 
}