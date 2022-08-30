node {
    checkout scm

    docker.withRegistry('https://registry.hub.docker.com','dockerhub') {

        def customImage = docker.build("mikidx280/hit-web-server:2.1.1")
        
        customImage.push()
    }
}

