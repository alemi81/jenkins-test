node {
    stage("prepaire-agent"){
        withCredentials([sshUserPrivateKey(credentialsId: 'jenkins-master', keyFileVariable: 'SSH_PRIVAE_KEY', usernameVariable: 'SSH_USER')]) {
    // some block
    sh "ssh -o StrictHostKeyChecking=no -i $SSH_PRIVAE_KEY $SSH_USER@165.22.184.230 sudo apt install default-jre -y && apt-get install git"
    }
            
    }
}