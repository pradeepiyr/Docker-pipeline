import groovy.transform.Field

@Field
def LOADED_BUILD_NUMBER = "${env.BUILD_NUMBER}"

return this
