Edite o arquivo TV.java e construa uma modelagem para representar uma TV utilizando as informações abaixo.

Uma televisão possui as seguintes características:

tamanho de tela (em polegadas);
volume: de 1 a 10 iniciando em 5;
marca;
voltagem (220 e 110);
canal.
A televisão pode realizar as seguintes ações:

ligar: ao ligar a televisão deve imprimir seu consumo. O consumo deve ser definido pela voltagem multiplicada pela quantidades de polegadas;
desligar;
aumentar e diminuir o volume;
subir e descer canal.

  class TV {
      int tamamhodatela= 95;
      int volume = 5; 
      string marca;
      int voltagem = 220 ;
      int canal;

     void ligar (){
       consumo = voltagem*polegadas;
       printf("O consumo é de: %d", consumo);
     }  
  
      int aumentarVolume(){
          if(volume < 10){
            volume++;
          }
        return volume;
      } 

      int diminuirVolume(){
          if(volume > 1){
            volume--;
          }
        return volume;
      }
  
      int subircanal(){
        canal++;
      }   
  
      int descercanal(){
        canal--;
      }
