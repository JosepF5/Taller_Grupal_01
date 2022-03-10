var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
  resolveAfter().then(dato=>{
    console.log(dato)
  })
  res.render('index', { title: 'Express Josepss Si Es' });
});
function resolveAfter(){
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve("¡Exito!");
    },2000)
  })
}
module.exports = router;
