#include <stdio.h>

void main() {
  float nota = 9.00;
  float *p;
  p = &nota;
  printf("%u\n", &nota); // endereço da nota ( 26826728 )
  printf("%u\n", p); // endereço da nota ( 26826728 )
  printf("%u\n", p+1); // 26826728 + 4 ( 26826732 )
  printf("%f\n", *p); // valor da nota 9.00
  printf("%f\n", *p+1); // 10.00
  printf("%f\n", *p*nota); // 81.00 ?
  printf("%f\n", *p/(*p)); // 1.00
  // CARALHO EU8QAYEWUAHSIUREYGASDIKR EU ACERTEI 😭😭😭😳
  return;
}