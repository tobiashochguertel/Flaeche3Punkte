## This is a base to get quickly started with standalone-endoint-testing!

**Example how you can use this for your own project *with and empty repository*:**
```
git clone https://tobias.hochguertel@intranet.valtech.com/bb/scm/vdc/template-standalone-endpoint-testing.git
git remote delete origin
git remote add origin <your-repository-url.git>
git push -u origin --all
```

**Exmaple how you can use this within your own project: *exsting repository and content*:** 
```
cd project-source

git clone https://tobias.hochguertel@intranet.valtech.com/bb/scm/vdc/template-standalone-endpoint-testing.git standalone-endpoint-testing
rm -rf standalone-endpoint-testing/.git

git add -A standalone-endpoint-testing
git commit -m "Adds Template Project: standalone-endpoint-testing"
git push
```
