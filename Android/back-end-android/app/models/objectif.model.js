const Joi = require('joi');
const BaseModel = require('../utils/base-model.js');

module.exports = new BaseModel('Objectif', {
  id: Joi.number().required(),
  typeObjectif: Joi.string().required(),
  dateDebut: Joi.string().required(),
  dateFin: Joi.string().required(),
  infoComplementaire: Joi.string().required(),
});
