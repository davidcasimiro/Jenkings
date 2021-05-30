def buildApp(){
  echo 'building the application...'
}

def testApp(){
  echo ' testing the Application...'
}

def deployApp(){
  echo 'deploying the Application...'
  echo "deplying version ${params.VERSION}"

}


return this
