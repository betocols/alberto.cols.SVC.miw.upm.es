#echo off
export workspace=/Users/albertocols/Documents/dev/MIW/Proyects_MIW/alberto.cols.SVC.miw.upm.es
echo -----------------------------------------
echo ". MIW"
echo -----------------------------------------
echo .
echo Workspace --- $workspace
echo .
echo .

cd $workspace
echo "============ mvn clean test (profile: develop) ======================================================="
echo .
mvn clean test -Denvironment.type=develop

echo "============ mvn package (profile: preproduction) ======================================================="
echo .
mvn package -Denvironment.type=preproduction