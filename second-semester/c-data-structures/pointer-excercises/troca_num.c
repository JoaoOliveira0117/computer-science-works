#include <stdio.h>

void troca(int *a, int *b) {
  int aux;
  aux = *a;
  *a = *b;
  *b = aux;
  printf("Troca feita \n");
}

void main() {
  int x, y;
  printf("Digite um numero: \n");
  scanf("%i", &x);
  printf("Digite outro numero: \n");
  scanf("%i", &y);
  printf("Numeros digitados: \n");
  printf("%i e %i", x, y);
  troca(&x, &y);
  printf("Numeros depois da troca: \n");
  printf("%i e %i", x, y);
  
  return;
}