package application;

import java.util.Scanner;

public class Ac2Censo {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
                                                        //x é o repetidor
		int idade = 0, totalIdade = 0, contadorIdade = 0, x, masculino = 0, feminino = 0, outro = 0, genero = 0, quantidadePessoal = 1000, totalIdadeHomens = 0;
		float porcentagemFinal = 0, contadorAlturaMulheres = 0, mediaIdadeGrupo = 0, mediaAlturaMulheres = 0, mediaIdadeHomens = 0, altura = 0, totalAlturaMulher = 0, percentualIdade18e35 = 0, totalIdade18e35 = 0;
    
		for (x = 0; x < quantidadePessoal; x++) //x é o contador, e quantidadePessoal é o tanto de pessoas que participaram do censo.
		{
			
			System.out.println("Nos informe sua idade.");  //obtenção de dados.
			idade = ler.nextInt();
			totalIdade = idade + totalIdade;
			
			System.out.println("1 masculino.\n2Feminino.\n3 outros."); //obtenção de dados.
			genero = ler.nextInt();
			
			System.out.println("Digite a sua altura.");
			altura = ler.nextFloat(); //obtenção de dados.

			 
			if (genero == 1) {                                         //se genero == 1 vai contar mais 1 masculino e  total idade de homens,          
				masculino ++;  
				totalIdadeHomens = idade + contadorIdade;
				contadorIdade = totalIdadeHomens;
			}else if(genero == 2) {
				feminino ++;                                          //se genero == 2 vai contar  +1 feminino e total altura da mulher
				totalAlturaMulher = altura + contadorAlturaMulheres;
				contadorAlturaMulheres = totalAlturaMulher;
			}else if(genero == 3){
				outro ++;                                             //se genero == 3 vai contar mais 1 pro genero outro
			}
			
			if (quantidadePessoal > 0) {
				mediaIdadeGrupo = totalIdade/quantidadePessoal;       //aqui conta a quantidade de pessoas da pesquisa e divide por 50 pra obter a media de idade.
			}
			
			if (feminino > 0) {
				mediaAlturaMulheres = totalAlturaMulher/feminino;     //media da altura das mulheres.
			}
			
			if (masculino > 0 ) {
				mediaIdadeHomens = totalIdadeHomens/masculino;       //media idade homens.
			}
			
			if(idade >= 18 && idade <= 35) {                                //acumular dados de pessoas entre 18 e 35 anos.
				totalIdade18e35++;
				percentualIdade18e35 = totalIdade18e35/quantidadePessoal;
				porcentagemFinal = percentualIdade18e35 * 100;
			}
		}
		
		//a) média da idade do grupo; X
		//b) média da altura das mulheres; X
	    //c) média da idade dos homens; X
	    //d) quantidade de pessoas que identificaram como outros; X
	    //e) percentual de pessoas com idade entre 18 e 35 anos (inclusive).
            
        System.out.println("A média de idade do grupo é de: "+mediaIdadeGrupo);  //imprimir na tela media de idade do grpo, media altura mulheres Etc
        
        System.out.println("A média de altura das mulheres é de: "+mediaAlturaMulheres);
        
        System.out.println("A média de idade dos homens é de: "+mediaIdadeHomens);
        
        System.out.println("A quantidade de pessoas que se identificaram como outros é de: "+outro);
        
        System.out.println("O percentual de pessoas com idade entre 18 e 35 anos é de: "+porcentagemFinal);
			
		
		
	}
}
