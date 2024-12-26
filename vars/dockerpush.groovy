def call(String credId, String imageName, String imageTag) {
    withCredentials([usernamePassword(credentialsId: credId, usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
        sh "docker login -u ${DOCKER_USER} -p ${DOCKER_PASS}"
        sh "docker tag ${imageName}:${imageTag} ${DOCKER_USER}/${imageName}:${imageTag}"
        sh "docker push ${DOCKER_USER}/${imageName}:${imageTag}"
    }
}
