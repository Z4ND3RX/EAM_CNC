1. Descargar la Imagen Nginx
![image](https://github.com/Z4ND3RX/EAM_CNC/assets/106892676/971c08fb-9984-46d4-afac-9937ce718cfa)

Creamos una carpeta llamada Docker, dentro de ella otro directorio llamado nginx-html y en él, metemos el archivo index.html

Luego, en la carpeta Docker creamos un archivo Dockerfile en el que asignamos las siguientes líneas como lo explica la guía de cómo usar la imagen de Nginx

FROM nginx
COPY static-html-directory /usr/share/nginx/html 

Ejecutamos el comando docker build -t web .
![image](https://github.com/Z4ND3RX/EAM_CNC/assets/106892676/f7a5711e-edeb-48b4-8d48-311c2a3ff523)

Como podemos evidenciar, tenemos la imagen de web creada..

Ejecutamos el comando docker run -d -p 8080:80 web
![image](https://github.com/Z4ND3RX/EAM_CNC/assets/106892676/8bb5e266-14c7-4581-9d22-f6acfae88c0c)


y con esto, tendremos el contenedor corriendo en localhost:8080
![image](https://github.com/Z4ND3RX/EAM_CNC/assets/106892676/51ddb1b2-6e13-4e14-a032-c030a7349549)



