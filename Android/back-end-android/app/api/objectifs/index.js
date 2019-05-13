const { Router } = require('express');
const { Objectif } = require('../../models');

const router = new Router();
router.get('/', (req, res) => res.status(200).json(Objectif.get()));
router.get('/:objectifId', (req, res) => res.status(200).json(Objectif.getById(req.params.objectifId)));

module.exports = router;

