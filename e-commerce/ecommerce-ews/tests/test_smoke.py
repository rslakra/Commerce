import unittest

from webapp.app import create_app


class TestHealthCheck(unittest.TestCase):
    def setUp(self):
        self.app = create_app()
        self.client = self.app.test_client()

    def test_health_check_returns_ok(self):
        response = self.client.get("/ecommerce-ews/health-check/")
        self.assertEqual(response.status_code, 200)
        self.assertIn(b"ok", response.data)
