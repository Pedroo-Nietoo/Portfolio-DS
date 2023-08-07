Autoria 1 - Criação básica de uma IA:
```python
import openai

api_key = "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"
openai.api_key = api_key

def responder_pergunta(pergunta):
    resposta = openai.Completion.create(
        engine="text-davinci-002",
        prompt=pergunta,
        max_tokens=150,
        stop=["\n", "IA:"]
    )
    return resposta['choices'][0]['text'].strip()

while True:
    entrada = input("Você: ")
    if entrada.lower() == "adeus":
        print("IA: Até logo!")
        break
    else:
        resposta = responder_pergunta("Você: " + entrada)
        print("IA:", resposta)
```

Autoria 2 - Início da [Autoria do TCC](https://github.com/Hugo-Team)
