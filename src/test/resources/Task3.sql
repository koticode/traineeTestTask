select (select count(*) from orders join promocodes ON orders.promocode_id=promocodes.promocode_id)/(select count(*) from orders) as "Доля заказов с промокодами ";
/*На практике в подобной задаче долю выразили бы в процентах, но т.к. в условиях задачи этого уточнения нет- запрос вернет именно долю.*/