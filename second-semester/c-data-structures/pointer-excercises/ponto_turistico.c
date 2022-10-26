#include <stdio.h>

struct PontoTuristico {
  char descricao[41];
  float latitude, longitude;
  struct PontoTuristico *proximo;
};

struct PontoTuristico* criar_lista(void) {
  return NULL;
}

void lerPontoTuristico(struct PontoTuristico *aux) {
  printf("\nDescricao: ");
  scanf("%[^\n]", aux->descricao);
  fflush(stdin);
  printf("\nLatitute: ");
  scanf("%f", &aux->latitude);
  fflush(stdin);
  printf("\nLongitude: ");
  scanf("%f", &aux->longitude);
  fflush(stdin);
}

struct PontoTuristico* inserir_inicio(struct PontoTuristico* cabeca) {
  struct PontoTuristico* novo = (struct PontoTuristico*) malloc(sizeof(struct PontoTuristico));
  lerPontoTuristico(novo);
  novo->proximo = cabeca;
  return (novo);
}

void imprimir(struct PontoTuristico *cabeca) {
  struct PontoTuristico *paux;
  for (paux = cabeca; paux != NULL; paux = paux->proximo)
    printf("Descricao: %s\tLatitude: %.2f\tLongitude: %.2t\t\n", 
      paux->descricao, paux->latitude, paux->longitude);
}

void main() {
  struct PontoTuristico *cabeca;
  cabeca = criar_lista();
  int continuar = 1;
  while(continuar == 1) {
    cabeca = inserir_inicio(cabeca);
    printf("Deseja continuar?\n");
    printf("1 = SIM\n");
    printf("0 ( ou qualquer outro numero ) = NAO\n");
    scanf("%d", &continuar);
    fflush(stdin);
    if( continuar != 1 ){
      break;
    };
  }
  imprimir(cabeca);
  return;
}