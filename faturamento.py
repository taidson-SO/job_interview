import pandas as pd

dados = pd.read_json('dados.json')

diasComFaturamento = dados[dados['valor'] != 0]
menorFaturamento = diasComFaturamento['valor'].min()
maiorFaturamento = diasComFaturamento['valor'].max()
diaMenorFaturamento = dados[dados['valor'] == menorFaturamento]['dia'].values[0]
diaMaiorFaturamento = dados[dados['valor'] == maiorFaturamento]['dia'].values[0]

mediaFaturamento = diasComFaturamento['valor'].mean()
diasAcimaDaMedia = diasComFaturamento[diasComFaturamento['valor'] > mediaFaturamento]['dia'].count()


print(f'Dia {diaMenorFaturamento} houve o menor faturamento equivalente a {menorFaturamento}')
print(f'Dia {diaMaiorFaturamento} houve o maior faturamento equivalente a {maiorFaturamento}')
print(f'A média de faturamento mensal {mediaFaturamento} e o numero de dias acima da média no mês foram {diasAcimaDaMedia}')

