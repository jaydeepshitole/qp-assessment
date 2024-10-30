# qp-assessment

Admin Endpoints:

/admin/item (POST): Add a new grocery item.
/admin/items (GET): View all grocery items.
/admin/item/{id} (DELETE): Delete a grocery item.
/admin/item/{id} (PUT): Update details of a grocery item.
/admin/item/{id}/inventory (PATCH): Update inventory of a grocery item.

User Endpoints:

/user/items (GET): View available grocery items.
/user/order (POST): Place an order for multiple items.