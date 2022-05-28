node {
    checkout scm
    def a = load('a.groovy')
    echo("${env.BUILD_NUMBER}")
    echo("${a.LOADED_BUILD_NUMBER}")

    docker.withRegistry('https://hub.docker.com/u/pradeepiyer01', 'docker-hub') {

        def customImage = docker.build("nodejs:${env.BUILD_ID}")

        /* Push the container to the custom Registry */
        customImage.push()
    }
}
