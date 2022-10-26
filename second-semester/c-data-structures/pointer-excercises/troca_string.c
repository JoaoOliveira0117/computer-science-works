#include <stdio.h>
#include <string.h>
#define STRINGSIZE 10

void troca(char *a, char *b) {
  char aux = 'a';
  while(*b  != '\0') {
    //aux = *a++;
    *a++ = *b++;
    *b++ = aux;
  };
  *a = '\0';
  *b = '\0';
}

void main() {
  char x[STRINGSIZE];
  char y[STRINGSIZE];
  printf("Primeira frase: \n");
  scanf("%s", &x);
  printf("Segunda frase: \n");
  scanf("%s", &y);
  troca(x, y);
  printf("%s\n%s\n", x, y);
  
  return;
}