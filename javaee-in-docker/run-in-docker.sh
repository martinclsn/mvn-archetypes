DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
cd $DIR

mvn clean install
cd target
docker build -t javaee .
docker run -p 8080:8080 javaee