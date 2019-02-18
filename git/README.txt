# Car-Rental

Projeto realizado para avalia��o t�cnica do processo seletivo de est�gio do LEMAF. 

Tal projeto � destinado a uma locadora de carros, para auxiliar seus cliente a encontrar o carro mais barato em rela��o � quantidade de passageiros desejados. 
Obter a sa�da atrav�s dos c�lculo das taxas requeridas pela locadora em rela��o aos dias solicitados pelo cliente seria redundante e o processo ficaria mais lento, pois obtem-se os mesmo resultados ao levando em considera��o apenas a quantidade de passageiros pretendida. 

A entrada pode ser atrav�s de um arquivo no formato .txt ou com a entrada dos dados. Por�m, h� um formato espec�fico para ambas e as informa��es devem estar neste modelo:  <TIPO_CLIENTE>:<QUATIDADE_PASSAGEIRO>:<DATA1>,<DATA2>,<DATA3>,<DATA4>... 
Por exemplo: normal:7:16Mar2015(ter),17Mar2015(qua),18Marc2015(qui),19Mar2015(sex),20Mar2015(sab). 

Se a entrada for atrav�s do arquivo, o mesmo deve estar armazenado no mesmo diret�rio que os outros arquivos do projeto. 
O arquivo "input.txt" inserido aqui � um exemplo que pode ser usado.

O tipo do cliente n�o diferencia letras min�sculas de mai�sculas e pode variam entre "nomal" e "premium".

A quantidade de passegeiro aceit�vel � entre 1 e 7.

As datas solicitadas devem ser informadas exatamente como no exemplo anterior e as refer�ncias para os dias da semana apenas com a tr�s primeiras iniciais. 
N�o h� limite estabelecido para as datas.

A primeira sa�da � o carro mais barato dispon�vel, em segui a loja em que o carro se encontra, tendo em vista que a mesma locadora possui tr�s lojas.

Ap�s isso, h� a possibilidade de ser informado o valor do aluguel pretendido. 
Para isto, ser� pedido uma entrada, sendo "1" para informar as taxas ou "2" para n�o informar e encerrar o programa.