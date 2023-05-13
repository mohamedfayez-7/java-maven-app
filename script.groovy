def buildApp() {
    echo 'building the application...'
    echo "deploying version ${params.VERSION}"
} 

def testApp() {
    echo 'testing the applicatopn...'
}

def deployApp() {
    echo 'deploying the application...'
    echo "deploying version ${params.VERSION}"
} 

return this
