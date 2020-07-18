# geoproxy
This is a simple proxy sever designed in microservice architecture style.

The server splits requests to GeoServer API and GeoServer web interface
## Installation
Use Docker

    docker pull emelyanovkonstantin/geoproxy
    sudo docker run -ti -d --net host emelyanovkonstantin/geoproxy
and open broweser on `http://localhost:8587`