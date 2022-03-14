const mongoose= require('mongoose');
const Schema=mongoose.Schema;
const mongooseSoftDelete = require('mongoose-delete');

const userSchema=new Schema({
    type:{
        type:String,
        trim: true,
        required:[true, 'El nombre del usuario es requerido']
    },
    gamers:{
        type:[{
            type: String,
            trim: true,
            require:[true, 'El nombre del jugador es requerido']
        }],
        required:[true, 'Ingrese al menos un jugador.']
    }
}, { timestamps: true });

userSchema.plugin(mongooseSoftDelete);

module.exports=Game=mongoose.model('Game',userSchema);