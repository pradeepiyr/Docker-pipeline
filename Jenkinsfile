node {
    checkout scm
    import groovy.transform.Field

@Field
def LOADED_BUILD_NUMBER = "${env.BUILD_NUMBER}"

return this

    docker.withRegistry('https://hub.docker.com/u/pradeepiyer01', 'docker-hub') {

        def customImage = docker.build("nodejs:${env.BUILD_ID}")

        /* Push the container to the custom Registry */
        customImage.push()
    }
}
