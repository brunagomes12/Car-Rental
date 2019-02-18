# Car-Rental

Projeto realizado para avaliação técnica do processo seletivo de estágio do LEMAF. 

Tal projeto é destinado a uma locadora de carros, para auxiliar seus cliente a encontrar o carro mais barato em relação à quantidade de passageiros desejados. 
Obter a saída através dos cálculo das taxas requeridas pela locadora em relação aos dias solicitados pelo cliente seria redundante e o processo ficaria mais lento, pois obtem-se os mesmo resultados ao levando em consideração apenas a quantidade de passageiros pretendida. 

A entrada pode ser através de um arquivo no formato .txt ou com a entrada dos dados. Porém, há um formato específico para ambas e as informações devem estar neste modelo:  <TIPO_CLIENTE>:<QUATIDADE_PASSAGEIRO>:<DATA1>,<DATA2>,<DATA3>,<DATA4>... 
Por exemplo: normal:7:16Mar2015(ter),17Mar2015(qua),18Marc2015(qui),19Mar2015(sex),20Mar2015(sab). 

Se a entrada for através do arquivo, o mesmo deve estar armazenado no mesmo diretório que os outros arquivos do projeto. 
O arquivo "input.txt" inserido aqui é um exemplo que pode ser usado.

O tipo do cliente não diferencia letras minúsculas de maiúsculas e pode variam entre "nomal" e "premium".

A quantidade de passegeiro aceitável é entre 1 e 7.

As datas solicitadas devem ser informadas exatamente como no exemplo anterior e as referências para os dias da semana apenas com a três primeiras iniciais. 
Não há limite estabelecido para as datas.

A primeira saída é o carro mais barato disponível, em segui a loja em que o carro se encontra, tendo em vista que a mesma locadora possui três lojas.

Após isso, há a possibilidade de ser informado o valor do aluguel pretendido. 
Para isto, será pedido uma entrada, sendo "1" para informar as taxas ou "2" para não informar e encerrar o programa.