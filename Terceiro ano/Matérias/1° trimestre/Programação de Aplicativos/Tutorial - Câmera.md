# Tutorial - Permissão da câmera

1. No `*AndroidManifest.xml*`, crie a permissão para a câmera com o seguinte código:

```xml
<!-- Libera a permissão da câmera -->
<uses-permission android:name="android.permission.CAMERA"/>
```

1. Pegamos a variável com um *`findViewById()`* e criaremos um `*if*` para solicitar a permissão do uso da câmera caso ela não esteja garantida

```java
ImageView foto;
foto = findViewById(R.id.imageView); //Pega o id do XML e atribui a uma variável no Java

//Checa a permissão da câmera. Se não estiver garantida, solicita
if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
	ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, 0);
}
```

```java
ActivityCompat.checkSelfPermission() //Responsável por checar a permissão de algo
Manifest.permission.CAMERA //Qual permissão quero checar
PackageManager.PERMISSION_GRANTED //Permissão está garantida
	//Classe mostra as permissões = PackageManager
	//Classe que checa as permissões = checkSelfPermission

ActivityCompat.requestPermissions(); //Solicita uma permissão. Precisa de uma Array
new String[]{Manifest.permission.CAMERA}, 0 //Cria uma nova String com o valor da permissão da câmera. 0 = Código da requisição
//Toda vez que o app tenta acessar algo do celular e extrapola os limites dele, ele pede um código de requisição
```

1. Criaremos uma função *`tirarFoto`* para tirar a foto

```java
public void tirarFoto(View v){
        Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(i, 1);
}
//MediaStore.ACTION_IMAGE_CAPTURE = "Activity"/tela da câmera do celular
//startActivityForResult(i, 1); = Inicia a tela esperando um resultado (código de requisição, 1)
```

1. Criaremos um método para pôr a foto tirada no *ImageView*

```java
@Override //Método que sobrescreve
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1 &&  resultCode == RESULT_OK){
            Bundle dado = data.getExtras();
            Bitmap imagem = (Bitmap) dado.get("data");
            foto.setImageBitmap(imagem);
        }
}

//*onActivityResult* = Recebe o resultado de *startActivityForResult*
 if(requestCode == 1 &&  resultCode == RESULT_OK){ //Se o código de requisição for igual a 1 e o resultado or 'OK'
		Bundle dado = data.getExtras(); //Cria uma objeto 'dado' do bundle e seu valor é o resultado da foto
		Bitmap imagem = (Bitmap) dado.get("data"); //Cria um objeto 'imagem' do Bitmap (tipo de dado comátível com imagem). Seu resultado pega as informações e retorna para o ImageView
}
```

Esse código Java é um método chamado "*onActivityResult*" que é executado quando uma atividade é finalizada e retorna um resultado para a atividade que o chamou. Ele é usado em aplicativos Android que precisam receber dados de outras atividades.

O método tem três parâmetros: *requestCode*, *resultCode* e *data*. O "*requestCode*" é um código de solicitação que foi usado para iniciar a atividade. O "*resultCode*" indica se a atividade foi concluída com sucesso ou não. E o "*data*" contém os dados retornados pela atividade.

Na primeira linha do método, ele chama o método "*super*.*onActivityResult*" para garantir que a superclasse seja notificada do resultado da atividade. Em seguida, ele verifica se o código de solicitação é 1 e se o resultado é RESULT_OK, indicando que a atividade foi concluída com sucesso. Se sim, ele obtém um objeto Bundle de dados e, em seguida, uma imagem Bitmap que foi retornada pela atividade. Por fim, ele define a imagem Bitmap em um objeto ImageView chamado "foto".

Em resumo, esse método recebe uma imagem Bitmap retornada por uma atividade e exibe-a em um ImageView em um aplicativo Android.