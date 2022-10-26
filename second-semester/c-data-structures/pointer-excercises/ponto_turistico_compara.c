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
    printf("Descricao: %s\tLatitude: %.2f\tLongitude: %.2f\t\n", 
      paux->descricao, paux->latitude, paux->longitude);
}

int comparaDadosLista(struct PontoTuristico *listaUm, struct PontoTuristico *listaDois) {
  if(
    (strcmp(listaUm->descricao, listaDois->descricao) == 0) &&
    (listaUm->latitude == listaDois->latitude) &&
    (listaUm->longitude == listaDois->longitude)
  ) {
    return 1;
  }

  return 0;
}

void comparaLista(struct PontoTuristico *listaUm, struct PontoTuristico *listaDois) {
  struct PontoTuristico *lista;
  struct PontoTuristico *compara;
  lista = listaUm;
  compara = listaDois;
  int igual = 0;

  while(lista != NULL && compara != NULL) {
    igual = comparaDadosLista(lista, compara);
    if(igual == 0) {
      break;
    }
    lista = lista->proximo;
    compara = compara->proximo;
  }

  if(lista == NULL && compara == NULL) {
    igual = 1;
  }

  if(igual == 1) {
    printf("Listas sao iguais");
    return;
  }

  printf("Listas nao sao iguais");
  return;
}

void main() {
  struct PontoTuristico *cabeca;
  struct PontoTuristico *lista2;
  cabeca = criar_lista();
  lista2 = criar_lista();
  for(int i = 0; i < 2; i++){
    int continuar = 1;
    while(continuar == 1) {
      if(i == 0) {
        cabeca = inserir_inicio(cabeca);
      } else {
        lista2 = inserir_inicio(lista2);
      }
      printf("Deseja continuar?\n");
      printf("1 = SIM\n");
      printf("0 ( ou qualquer outro numero ) = NAO\n");
      scanf("%d", &continuar);
      fflush(stdin);
      if( continuar != 1 ){
        break;
      };
    }
    if(i == 0) {
      imprimir(cabeca);
    } else {
      imprimir(lista2);
    }
  }
  comparaLista(cabeca, lista2);
  return;
}