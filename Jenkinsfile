pipeline{
agent any
    stages{
        stage('Clone Git'){
        steps{
            git 'https://github.com/MeetGoswami/Project11.git'
        }
    }
    stage('Build Code'){
        steps{
            sh "chmod +x Add.java"
            sh "javac Add.java"
        }
    }
    stage('Test Code'){
        steps{
            sh "chmod +x TestAdd.java"
            sh "javac TestAdd.java"
            sh "java TestAdd"
        }
    }
}
}
