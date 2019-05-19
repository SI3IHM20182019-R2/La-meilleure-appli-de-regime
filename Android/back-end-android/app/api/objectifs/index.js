const { Router } = require('express');
const { Objectif } = require('../../models');

const router = new Router();
router.get('/', (req, res) => res.status(200).json(Objectif.get()));
router.get('/:objectifId', (req, res) => res.status(200).json(Objectif.getById(req.params.objectifId)));
router.delete('/:objectifId', (req, res) => res.status(200).json(Objectif.delete(req.params.objectifId)));
router.put('/:objectifId', (req, res) => res.status(200).json(Objectif.update(req.params.objectifId, req.body)));

module.exports = router;
