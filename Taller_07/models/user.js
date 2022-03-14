const mongoose= require('mongoose');
const Schema=mongoose.Schema;
const mongooseSoftDelete = require('mongoose-delete');

const validateEmail= (email)=>{
    var regex=/[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?/;
    return regex.test(email);
}
const userSchema=new Schema({
    name:{
        type:String,
        trim: true,
        required:[true, 'El nombre del usuario es requerido']
    },
    lastname: {
        type:String,
        trim: true,
        required:[true, 'El apellido del usuario es requerido']
    },
    age:{
        type:Number,
        min: [18, 'La edad mínima es de 18 años'],
        max: [90, 'La edad máxima es de 90 años']
    },
    email:{
        type:String,
        trim: true,
        required:[true, 'El correo es requerido'],
        unique: true,
        validate: {
            validator: validateEmail,
            message: 'El correo no es válido'
        }
    },
    genre: {
        type: String,
        required: false,
        enum: ['masculino', 'femenino']
    }
}, { timestamps: true });

userSchema.plugin(mongooseSoftDelete);

module.exports=User=mongoose.model('User',userSchema);