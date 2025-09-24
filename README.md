# Massa Corporal

Cálculo de IMC e resultado na tabela para os sexos Masculino e Feminino.

| Condição                    | IMC em Mulheres              | IMC em Homens                |
|-----------------------------| ---------------------------- | ---------------------------- |
| Abaixo do peso              | imc < 19,1                   | imc < 20,7                   |
| Peso normal                 | 19,1 <= imc < 25,8           | 20,7 <= imc < 26,4           |
| Marginalmente acima do peso | 25,8 <= imc < 27,3          | 26,4 <= imc < 27,8           |
| Acima do peso ideal         | 27,3 <= imc < 32,3           | 27,8 <= imc < 31,1           |
| Obesidade                   | imc >= 32,3                  | imc >= 31,1                  |

Complexidade ciclomática:

<div style="display: flex; justify-content: center; align-items: flex-start;">
  <img src="./imgs/codigo.png" alt="Código" width="500" style="margin-right: 10px;">
  <img src="./imgs/complexidade-ciclomatica.png" alt="Complexidade Ciclomática" width="300">
</div>

---

### Diagrama no PlantUML: 

```bash
@startuml
skinparam nodesep 40
skinparam ranksep 5

state 9 #lightskyblue
state 8 #lightskyblue
state 7 #lightskyblue
state 6 #lightskyblue
state 5 #lightskyblue
state 4 #lightskyblue
state 3 #lightskyblue
state 2 #lightskyblue
state 1 #lightskyblue

1 --> 2
1 --> 3

2 --> 4
3 --> 4

4 --> 9
4 --> 5

5 --> 9
5 --> 6

6 --> 9
6 --> 7

7 --> 9
7 --> 8

8 --> 9
@enduml
```