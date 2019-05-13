const { Router } = require('express');
const ObjectifRouter = require('./objectifs');

const router = new Router();
router.get('/status', (req, res) => res.status(200).json('ok'));
router.use('/objectifs', ObjectifRouter);

module.exports = router;
